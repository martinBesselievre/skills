<template>
<div class="itemdetails">
    <h1>This is an ItemDetails page</h1>
    <button v-on:click="addToCart">Add to Cart</button>
</div>
</template>

<script>
export default {
    name: 'item-details',
    beforeCreate() {
        console.log("beforeCreate")
    },
    created() {
        console.log("Created")
    },
    beforeMount() {
        console.log("beforeMount")
    },
    mounted() {
        console.log("mounted")
    },
    destroyed() {
        console.log("destroyed")
    },
    methods: {
        addToCart() {
            console.log(this.$parent.$options.name)
            this.$emit('update-cart-items-counter')
        }
    },
}
</script>
