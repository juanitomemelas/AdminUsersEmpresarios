<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<footer class="container-fluid text-center"><p>Control de usuarios empresariales</p></footer>
    <script src="./js/jquery-3.3.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
<!--     <script src="./js/moment.js"></script> -->
 <script src="./js/funciones.js"></script>
  <c:if test="${not empty param.codigoJavascript}"><script>${param.codigoJavascript}</script></c:if>
</body>
</html>