<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Домашняя</title>
</head>

<body>
<div id="container">
    <h1>Contact Us</h1>
    <form method="post" action="/submit" id="contact-us">
        <div id="contact-us-message"></div>
        <div class="input-box">
            <label>Name</label>
            <input type="text" name="name" />
        </div>
        <div class="input-box">
            <label>Email</label>
            <input type="text" name="email" />
        </div>
        <div class="input-box">
            <label>Message</label>
            <textarea name="message"></textarea>
        </div>
        <div class="submit">
            <input type="submit" value="Submit" />
        </div>
    </form>
</div>
</body>
</html>