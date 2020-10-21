<template>
<span>
    <router-link :to="url">{{text}}</router-link>
</span>
</template>

<script>
export default {
    name: 'nav-link',
    props: ['url', 'text']
}
</script>
