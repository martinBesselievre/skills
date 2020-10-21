<template>
<div id="app">
    <nav-bar v-bind:counter="counter" />
    <router-view @update-cart-items-counter='updateCartItemsCounter' />
</div>
</template>

<script>
import NavBar from '@/components/NavBar'
export default {
    name: 'App',
    components: {
        NavBar
    },
    data: function () {
        return {
            counter: 0
        }
    },
    methods: {
        updateCartItemsCounter() {
            this.counter += 1
        }
    }
}
</script>

<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
}

#nav {
    padding: 30px;
}

#nav a {
    font-weight: bold;
    color: #2c3e50;
}

#nav a.router-link-exact-active {
    color: #42b983;
}
</style>
