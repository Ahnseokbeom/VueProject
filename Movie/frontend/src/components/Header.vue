<template>
    <div>
        <v-app-bar dense="dense" dark="dark">
            <ul class="menu">
                <li>
                    <v-btn @click="toHome">
                        Home
                    </v-btn>
                </li>
                <li>
                    <v-btn @click="Movie">
                        Page1
                    </v-btn>
                </li>
                <li>
                    <v-btn @click="toPage2">
                        Page2
                    </v-btn>
                </li>
            </ul>
        </v-app-bar>
    </div>
</template>

<script>
    export default {

        methods: {
            toHome() {
                this.$router.push("/")
            },
            Movie() {
              this.$router.push("/movie")
            },
            toPage2() {
              this.$router.push("/")
            }
        }
    }
</script>

<style>
    ul.menu li {
        display: inline;
    }
</style>