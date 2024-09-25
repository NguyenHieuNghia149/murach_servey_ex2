<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Thank You for Joining!</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
<div class="container">
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>
    <div class="form--item">
        <label>Email:</label>
        <span>${user.email}</span><br>
    </div>
    <div class="form--item">
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
    </div>
    <div class="form--item">
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
    </div>
    <div class="form--item">
        <label>Date:</label>
        <span>${{formattedDate}}</span><br>
    </div>
    <div class="form--item">
        <label>I know you through:</label>
        <span>${user.sourceInfor}</span><br>
    </div>
    <div class="form--item">
        <label>Answer of receive announcements:</label>
        <span>${user.offer}</span><br>
    </div>
    <div class="form--item">
        <label>Contact method:</label>
        <span>${user.contact}</span><br>
    </div>
    <p>To enter another email address, click on the Back
        button in your browser or the Return button shown
        below.</p>
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return" class = btn-return>
    </form>
</div>
</body>
</html>
