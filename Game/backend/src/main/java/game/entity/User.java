package game.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;     // 로그인할 때 사용하는 아이디
    private String password;    // 비밀번호
    private String nickname;    // 닉네임
    private LocalDateTime createdAt;    // 가입 시간
    private Integer receivedLikeCnt; // 유저가 받은 좋아요 개수 (본인 제외)

    @Enumerated(EnumType.STRING)
    private UserRole userRole;      // 권한

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Board> boards;     // 작성글

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Like> likes;       // 유저가 누른 좋아요

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Comment> comments; // 댓글

    public void rankUp(UserRole userRole, Authentication auth) {
        this.userRole = userRole;

        // 현재 저장되어 있는 Authentication 수정 => 재로그인 하지 않아도 권한 수정 되기 위함
        List<GrantedAuthority> updatedAuthorities = new ArrayList<>();
        updatedAuthorities.add(new SimpleGrantedAuthority(userRole.name()));
        Authentication newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(), updatedAuthorities);
        SecurityContextHolder.getContext().setAuthentication(newAuth);
    }

    public void likeChange(Integer receivedLikeCnt) {
        this.receivedLikeCnt = receivedLikeCnt;
        if (this.receivedLikeCnt >= 10 && this.userRole.equals(UserRole.SILVER)) {
            this.userRole = UserRole.GOLD;
        }
    }

    public void edit(String newPassword, String newNickname) {
        this.password = newPassword;
        this.nickname = newNickname;
    }

    public void changeRole() {
        if (userRole.equals(UserRole.BRONZE)) userRole = UserRole.SILVER;
        else if (userRole.equals(UserRole.SILVER)) userRole = UserRole.GOLD;
        else if (userRole.equals(UserRole.GOLD)) userRole = UserRole.BLACKLIST;
        else if (userRole.equals(UserRole.BLACKLIST)) userRole = UserRole.BRONZE;
    }
}
