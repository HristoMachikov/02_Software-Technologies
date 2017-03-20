<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ExtractCapitalCaseWords</title>
</head>
<body>
<?php
$result="";
if(isset($_GET['text'])){
    $text=$_GET['text'];
    preg_match_all('/\w+/',$text,$words);
    $words=$words[0];
    $upperWord=array_filter($words,function ($word){
        return strtoupper($word)==$word;
    });
    //echo implode(', ', $upperWord);
}
?>
<form>
    <textarea rows="10" name="text"><?= $result=implode(', ', $upperWord); ?></textarea>
    <div><input  type="submit" value="Extract"/></div>
</form>
</body>
</html>