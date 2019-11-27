<?php
$servername = "remotemysql.com";
$username = "tgTI7MFQCi";
$password = "oXdMgUf7YU";
$database = "tgTI7MFQCi";

// Create connection
$conn = new mysqli($servername, $username, $password,$database);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
?>