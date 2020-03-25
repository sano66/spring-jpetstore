<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://amateras.sf.jp/functions" prefix="f"%>
<sec:authorize access="isAuthenticated()">
    <p>
        Pet Favorites <br /> Shop for more of your favorite pets here.
    </p>
    <ul>
        <sec:authentication property="principal.myList" var="products" />
        <c:forEach var="product" items="${products}">
            <li><a
                href="${pageContext.request.contextPath}/catalog/viewProduct?productId=${f:h(product.productId)}">
                    ${f:h(product.name)} </a>(${f:h(product.productId)})</li>
        </c:forEach>
    </ul>
</sec:authorize>
