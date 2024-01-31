const loginBtn = document.getElementById("loginBtn");
const registerBtn = document.getElementById("registerBtn");

let users = [];

loginBtn.addEventListener("click", (e) => {
  e.preventDefault();
  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;

  const user = users.find((user) => user.username === username);

  if (user) {
    if (user.password === password) {
        alert("Login successful!");
    } else {
        alert("Incorrect password");
    }
  } else {
    alert("User not found");
  }
});

registerBtn.addEventListener("click", (e) => {
  e.preventDefault();
  const username = document.getElementById("regUsername").value;
  const password = document.getElementById("regPassword").value;

  const user = users.find((user) => user.username === username);

  if (user) {
    alert("Username already taken");
  } else {
    users.push({
      username,
      password,
    });
    alert("Registration successful!");
  }
});
