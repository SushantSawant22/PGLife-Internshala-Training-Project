<?php
session_start();
session_destroy();
header("location: Home_Page.php");