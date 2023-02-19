const fruits = ["apple","banana","cherry"]

const type1 = fruits.find(value => {
    return /^a/.test(value);
})

const type2 = fruits.findIndex(value => {
    return /^b/.test(value);
})