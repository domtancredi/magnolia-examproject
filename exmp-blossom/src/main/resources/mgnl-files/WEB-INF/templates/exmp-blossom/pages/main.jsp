<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://magnolia-cms.com/taglib/templating-components/cms" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <cms:init />
    <head>
        <title>${content.title}</title>
        <meta name="description" content="${content.metaDescription}" />
        <meta name="keywords" content="${content.metaKeywords}" />      
        <link rel="shortcut icon" href="<c:url value="/docroot/exmp-blossom/images/icon.png" />" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/docroot/exmp-blossom/styles/exmp-blossom.css" />" />
        <script language="javascript" type="text/javascript" src="<c:url value="/docroot/exmp-blossom/scripts/jquery.js" />"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/docroot/exmp-blossom/scripts/jquery-ui.custom.min.js" />"></script>
        <script language="javascript" type="text/javascript" src="<c:url value="/docroot/exmp-blossom/scripts/exmp-blossom.js" />"></script>
    </head>
    <body>
        <div class="container">
            <cms:area name="menu" />
            <cms:area name="header" />
            <cms:area name="content" />
            <cms:area name="sidebar" />
            <cms:area name="footer" />
        </div>
    </body>
</html>