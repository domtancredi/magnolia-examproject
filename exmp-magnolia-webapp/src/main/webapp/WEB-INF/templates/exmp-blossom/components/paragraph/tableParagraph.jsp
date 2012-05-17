<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://magnolia-cms.com/taglib/templating-components/cms" %>
<%@ taglib prefix="cmsfn" uri="http://magnolia-cms.com/taglib/templating-components/cmsfn" %>

<div class="entry-paragraph-table">
    <div class="paragraph-table-title">${content.title}</div>
    <cms:area name="tableParagraphItem" />
</div>