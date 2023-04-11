<template>
  <v-app class="app">
    <v-app-bar app color="rgb(198, 186, 219)" dark >
      <div class="d-flex align-center">
        <v-app-bar-nav-icon></v-app-bar-nav-icon>
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
          <v-list-item-title><span><a href="/sport" style="color : black; text-decoration: none;">스포츠</a></span></v-list-item-title>
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
      <v-spacer></v-spacer>
        <v-btn icon href="/search" text><v-icon>mdi-magnify</v-icon></v-btn>
    </v-app-bar>
    <v-main>
  <v-data-table :headers="headers" :items="desserts" sort-by="calories" class="elevation-1">
    <template v-slot:top>
      <v-toolbar flat>
        <v-toolbar-title>게시판</v-toolbar-title>
        <v-divider class="mx-4" inset vertical></v-divider>
        <v-spacer></v-spacer>
        <v-dialog v-model="dialog" max-width="500px" >
          <template v-slot:activator="{ on, attrs }">
            <v-btn color="rgb(198, 186, 219)" dark class="mb-2" v-bind="attrs" v-on="on">
              글쓰기
            </v-btn>
          </template>
          <v-card>
            <v-card-title>
              <span class="text-h5">작성하기</span>
            </v-card-title>

            <v-card-text>
              <v-container>
                <v-row>
                    <v-col cols="12" sm="6" md="4" >
                    <v-text-field v-model="editedItem.name" label="name" ></v-text-field>
                  </v-col>
                  <v-col cols="12" sm="6" md="4" >
                    <v-text-field v-model="editedItem.name" label="name" ></v-text-field>
                  </v-col>
                  <v-col cols="12" sm="6" md="4" >
                    <v-text-field v-model="editedItem.calories" label="Calories" ></v-text-field>
                  </v-col>
                  <v-col cols="12" sm="6" md="4" >
                    <v-text-field v-model="editedItem.content" label="내용" ></v-text-field>
                  </v-col>
                  <!-- <v-col cols="12" sm="6" md="4">
                    <v-text-field v-model="editedItem.protein" label="Protein (g)" ></v-text-field>
                  </v-col> -->
                </v-row>
              </v-container>
            </v-card-text>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn color="blue darken-1" text @click="close" >닫기
              </v-btn>
              <v-btn color="blue darken-1" text @click="save" >저장
              </v-btn>
            </v-card-actions>
          </v-card>
        </v-dialog>
        <v-dialog v-model="dialogDelete" max-width="500px">
          <v-card>
            <v-card-title class="text-h5">삭제하시겠습니까?</v-card-title>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn color="blue darken-1" text @click="closeDelete">취소</v-btn>
              <v-btn color="blue darken-1" text @click="deleteItemConfirm">확인</v-btn>
              <v-spacer></v-spacer>
            </v-card-actions>
          </v-card>
        </v-dialog>
      </v-toolbar>
    </template>
    <template v-slot:[`item.actions`]="{ item }">
      <v-icon small class="mr-2" @click="editItem(item)">mdi-pencil
      </v-icon>
      <v-icon small @click="deleteItem(item)" > mdi-delete
      </v-icon>
    </template>
    <template v-slot:no-data>
      <v-btn color="rgb(198, 186, 219)" @click="initialize"> Reset
      </v-btn>
    </template>
  </v-data-table>
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
          // sortable: false,
          value: 'No',
        },
        { text: 'name', value: 'name' },
        { text: 'Calories', value: 'calories' },
        { text: 'Content', value: 'content' },
        { text: 'Actions', value: 'actions', sortable: false },
      ],
      desserts: [],
      editedIndex: -1,
      editedItem: {
        No : 0,
        name: '',
        calories: '',
        content : ''
      },
      defaultItem: {
        No : 0,
        name: '',
        calories: '',
        content : ''
      },
    }),

    computed: {
      formTitle () {
        return this.editedIndex === -1 ? 'New Item' : 'Edit Item'
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
        this.desserts = [
          {
            No : 1,
            calories: 'AOS',
            name: '안녕',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 2,
            calories: 'RPG',
            name: '안녕',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 3,
            calories: 'FPS',
            name: '안나',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 4,
            calories: 'SPORT',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 5,
            calories: 'FPS',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 6,
            calories: 'SPORT',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 7,
            calories: 'RPG',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 8,
            calories: 'SPORT',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 9,
            calories: 'FPS',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
           {
            No : 10,
            calories: 'RPG',
            name: '이제우리',
            content: '왜 그러는 걸까요?',
          },
          
        ]
      },

      editItem (item) {
        this.editedIndex = this.desserts.indexOf(item)
        this.editedItem = Object.assign({}, item)
        this.dialog = true
      },

      deleteItem (item) {
        this.editedIndex = this.desserts.indexOf(item)
        this.editedItem = Object.assign({}, item)
        this.dialogDelete = true
      },

      deleteItemConfirm () {
        this.desserts.splice(this.editedIndex, 1)
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
          Object.assign(this.desserts[this.editedIndex], this.editedItem)
        } else {
          this.desserts.push(this.editedItem)
        }
        this.close()
      },
    },
  }
</script>