const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter your age please: ", function(age) {
  age = parseInt(age);
  if (age < 18) {
    console.log("You are underage. You are only " + age);
  } else {
    console.log("You are an adult. You are already " + age + " go get a job!");
    if (age > 26) {
      console.log("You should already know that!");
    }
  }
  rl.close();
});