<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GET Request</title>
</head>
<body>
    <form>
        <div>Name:</div><input type="text" name="personName" />
        <div>Age:</div><input type="number" name="age" />
        <div>Town:</div>
        <select name="townId">
            <option value="10">Sofiq</option>
            <option value="20">Plovdiv</option>
            <option value="30">Varna</option>
            <option value="40">Burgas</option>
        </select>
        <div><input  type="submit" /></div>
    </form>
<?php var_dump($_GET);?>
</body>
</html>