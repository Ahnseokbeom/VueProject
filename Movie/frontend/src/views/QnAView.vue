<template>
  <v-app class="app">
    <v-app-bar app color="rgb(198, 186, 219)" dark >
      <div class="d-flex align-center">
        <v-menu offset-y open-on-hover>
          <template v-slot:activator="{ on, attrs }">
        <v-btn v-bind="attrs" v-on="on" text><v-app-bar-nav-icon x-large></v-app-bar-nav-icon></v-btn>
      </template>
      <v-list>
        <v-list-item link>
          <v-list-item-title><span><a href="/game" style="color : black; text-decoration: none;">게임</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/ranking" style="color : black; text-decoration: none;">랭킹</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/evaluation" style="color : black; text-decoration: none;">게임 평가</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/qna" style="color : black; text-decoration: none;">게시판</a></span></v-list-item-title>
        </v-list-item>
      </v-list>
        </v-menu>
        <v-toolbar-title><h2><a href="/">GameRating </a></h2></v-toolbar-title>
        </div>
      <v-container class="top">
        <v-menu offset-y open-on-hover>
          <template v-slot:activator="{ on, attrs }">
        <v-btn href="/game" v-bind="attrs" v-on="on" text><h2>게임</h2></v-btn>
      </template>
      <v-list>
        <v-list-item link>
          <v-list-item-title><span><a href="/aos" style="color : black; text-decoration: none;">AOS</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/rpg" style="color : black; text-decoration: none;">RPG</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/fps" style="color : black; text-decoration: none;">FPS</a></span></v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-title><span><a href="/sport" style="color : black; text-decoration: none;">ACT/SPT</a></span></v-list-item-title>
        </v-list-item>
      </v-list>
        </v-menu>
      </v-container>
      <v-container class="top">
        <v-btn href="/ranking" text><h2>랭킹</h2></v-btn>
      </v-container>
      <v-container class="top">
        <v-btn href="/evaluation" text><h2>게임 평가</h2></v-btn>
      </v-container>
      <v-container class="top">
        <v-btn href="/qna" text><h2>게시판</h2></v-btn>
      </v-container>
    </v-app-bar>
    <v-main>
      <template>
  <v-data-table
    :headers="headers"
    :items="board"
    sort-by="calories"
    class="elevation-1"
  >
    <template v-slot:top>
      <v-toolbar
        flat
      >
        <v-toolbar-title>자유 게시판</v-toolbar-title>
        <v-spacer></v-spacer>
        <v-dialog
          v-model="dialog"
          max-width="500px"
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              color="rgb(198, 186, 219)"
              dark
              class="mb-2"
              v-bind="attrs"
              v-on="on"
            >
              글쓰기
            </v-btn>
          </template>
          <v-card>
            <v-card-title>
              <span class="text-h5">{{ formTitle }}</span>
            </v-card-title>

            <v-card-text>
              <v-container>
                <v-row>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.number"
                      label="No"
                    ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.title"
                      label="제목"
                    ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                  <v-text-field
                      v-model="editedItem.category"
                      label="장르"
                    ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.content"
                      label="내용"
                    ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.author"
                      label="글쓴이"
                    ></v-text-field>
                  </v-col>
                </v-row>
              </v-container>
            </v-card-text>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn
                color="blue darken-1"
                text
                @click="close"
              >
                취소
              </v-btn>
              <v-btn
                color="blue darken-1"
                text
                @click="save"
              >
                저장
              </v-btn>
            </v-card-actions>
          </v-card>
        </v-dialog>
      </v-toolbar>
    </template>
  </v-data-table>
</template>
    </v-main>
        <v-footer class="footer">
      <v-spacer/> 201736023 안석범
      <v-btn href="https://github.com/ahnseokbeom" target="_blank" text>
        <span style="color : white;">github</span>
        </v-btn>
    </v-footer>
  </v-app>
</template>
<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');
.app{
    font-family: 'Jua', sans-serif;
}
span {
  font-family: 'Jua', sans-serif;
}
.font{
  font-family: 'Jua', sans-serif;
}
.footer {
  color:white;
  background: rgb(198, 186, 219);
}
h2>a {
  color : white;
  text-decoration: none;
}
.top{
  margin-left: 100px;
  font-size: 20px;
}
</style>
<script>
  export default {
    data: () => ({
      dialog: false,
      dialogDelete: false,
      headers: [
        {
          text: 'No',
          align: 'start',
          sortable: true,
          value: 'number',
        },
        { text: '제목', value: 'title' ,sortable: false},
        { text: '장르', value: 'category' ,sortable: false},
        { text: '내용', value: 'content' ,sortable: false},
        { text: '글쓴이', value: 'author' ,sortable: false},
      ],
      board: [],
      editedIndex: -1,
      editedItem: {
        number: 16,
        title: '',
        category: '',
        content: '',
        author: '',
      },
      defaultItem: {
        number: 16,
        title: '',
        category: '',
        content: '',
        author: '',
      },
    }),

    computed: {
      formTitle () {
        return '글 쓰기';
      },
    },

    watch: {
      dialog (val) {
        val || this.close()
      },
      dialogDelete (val) {
        val || this.closeDelete()
      },
    },

    created () {
      this.initialize()
    },

    methods: {
      initialize () {
        this.board = [
          {
            number: 1,
            title : '게임 추천 해주세요1',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?1',
            author : '글쓴이1'
          },
          {
            number: 2,
            title : '게임 추천 해주세요2',
            category : '스포츠',
            content : '무슨 게임이 좋을까요?2',
            author : '글쓴이2'
          },
          {
            number: 3,
            title : '게임 추천 해주세요3',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?3',
            author : '글쓴이3'
          },
          {
            number: 4,
            title : '게임 추천 해주세요4',
            category : 'FPS',
            content : '무슨 게임이 좋을까요?4',
            author : '글쓴이4'
          },
          {
            number: 5,
            title : '게임 추천 해주세요5',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?5',
            author : '글쓴이5'
          },
          {
            number: 6,
            title : '게임 추천 해주세요6',
            category : 'FPS',
            content : '무슨 게임이 좋을까요?6',
            author : '글쓴이6'
          },
          {
            number: 7,
            title : '게임 추천 해주세요7',
            category : '스포츠',
            content : '무슨 게임이 좋을까요?7',
            author : '글쓴이7'
          },
          {
            number: 8,
            title : '게임 추천 해주세요8',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?8',
            author : '글쓴이8'
          },
          {
            number: 9,
            title : '게임 추천 해주세요9',
            category : 'RPG',
            content : '무슨 게임이 좋을까요?9',
            author : '글쓴이9'
          },
          {
            number: 10,
            title : '게임 추천 해주세요10',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?10',
            author : '글쓴이10'
          },
          {
            number: 11,
            title : '게임 추천 해주세요11',
            category : '스포츠',
            content : '무슨 게임이 좋을까요?11',
            author : '글쓴이11'
          },
          {
            number: 12,
            title : '게임 추천 해주세요12',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?12',
            author : '글쓴이12'
          },
          {
            number: 13,
            title : '게임 추천 해주세요13',
            category : 'AOS',
            content : '무슨 게임이 좋을까요?13',
            author : '글쓴이13'
          },
          {
            number: 14,
            title : '게임 추천 해주세요14',
            category : 'FPS',
            content : '무슨 게임이 좋을까요?14',
            author : '글쓴이14'
          },
          {
            number: 15,
            title : '게임 추천 해주세요15',
            category : 'RPG',
            content : '무슨 게임이 좋을까요?15',
            author : '글쓴이15'
          },
        ]
      },

      editItem (item) {
        this.editedIndex = this.board.indexOf(item)
        this.editedItem = Object.assign({}, item)
        this.dialog = true
      },

      deleteItem (item) {
        this.editedIndex = this.board.indexOf(item)
        this.editedItem = Object.assign({}, item)
        this.dialogDelete = true
      },

      deleteItemConfirm () {
        this.board.splice(this.editedIndex, 1)
        this.closeDelete()
      },

      close () {
        this.dialog = false
        this.$nextTick(() => {
          this.editedItem = Object.assign({}, this.defaultItem)
          this.editedIndex = -1
        })
      },

      closeDelete () {
        this.dialogDelete = false
        this.$nextTick(() => {
          this.editedItem = Object.assign({}, this.defaultItem)
          this.editedIndex = -1
        })
      },

      save () {
        if (this.editedIndex > -1) {
          Object.assign(this.board[this.editedIndex], this.editedItem)
        } else {
          this.board.push(this.editedItem)
        }
        this.close()
      },
      action(){
        return 'item.actions';
      },
    },
  }
</script>