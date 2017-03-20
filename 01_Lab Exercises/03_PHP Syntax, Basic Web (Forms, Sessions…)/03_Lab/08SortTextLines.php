<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SortTextLines</title>
</head>
<body>
<?php
$sortedLines="";
if(isset($_GET['lines'])){
    $lines=explode("\n",$_GET['lines']);
    $lines=array_map('trim',$lines);
    sort($lines,SORT_STRING);
    $sortedLines=implode("\n",$lines);
}
?>
<form>
    <textarea rows="10" name="lines"><?=$sortedLines?></textarea>
    <div><input  type="submit" value="Sort"/></div>
</form>
</body>
</html>