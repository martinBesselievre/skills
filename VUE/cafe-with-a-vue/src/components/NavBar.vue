<template>
<div id="nav">
    <nav-link url="/" text="Home" /> |
    <nav-link url="/about" text="About" /> |
    <nav-link url="/contact" text="Contact" /> |
    <nav-link url="/cart" text="Cart" />
    <span class="counter">{{counter}}</span>
</div>
</template>

<script>
import NavLink from '@/components/NavLink'

export default {
    components: {
        NavLink
    },
    props: ['counter']
}
</script>

<style>
.counter {
    display: inline-block;
    background-color: lightblue;
    font-size: 0.8rem;
    margin-left: 5px;
    border-radius: 50%;
    border: solid;
    border-width: 0.5px;
    width: 1.2rem;
    height: 1.2rem;
}
</style>
