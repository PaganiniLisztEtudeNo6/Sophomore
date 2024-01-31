function validate() {
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;
  if (username == "admin" && password == "password") {
    alert("Login successful");
  } else {
    alert("Login failed. Incorrect username or password.");
  }
}