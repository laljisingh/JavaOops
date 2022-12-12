//objects JavaScrit
const person = {
  name: "lalji singh",
  age: 26,
  wish: function () {
    return this.age + " " + this.name;
  },
};

function age() {
  document.getElementById("h2").innerHTML = person.wish();
}

//string
// let str = "Apple, Banana, Kiwi";
// let part = str.substring(8, 13);
// document.write(part);
