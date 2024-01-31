function calCarPark(hours) {
    hours = parseInt(hours);
    var fee;
    if (hours <= 4) {
      fee = 0;
    } else if (hours > 4 && hours <= 12) {
      fee = (hours - 4) * 10;
    } else {
      fee = 300;
    }
    alert("Parking fee: " + fee + " Baht");
  }