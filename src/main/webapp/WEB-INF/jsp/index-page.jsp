<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Konsumen Table</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- DataTables CSS -->
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css">
</head>

<body>
<div class="container mt-4">
    <h2>Konsumen Table</h2>
    <button class="btn btn-primary" style="float: right" onclick="addHandle()"> add </button>
    <table id="konsumenTable" class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nama</th>
            <th>Alamat</th>
            <th>Kota</th>
            <th>Provinsi</th>
            <th>Tanggal Registrasi</th>
            <th>Status</th>
        </tr>
        </thead>
        <tbody>
        <!-- Table rows will be dynamically populated using JavaScript -->
<%--        <p>${dataList}</p>--%>
        <c:forEach var="item" items="${dataList}">
            <%-- Parse data using JSTL and EL --%>
            <tr>
                <td>${item.id}</td>
                <td>${item.nama}</td>
                <td>${item.alamat}</td>
                <td>${item.kota}</td>
                <td>${item.provinsi}</td>
                <td>${item.tglRegistrasi}</td>
                <td>${item.status}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- DataTables JS -->
<script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function() {
        // Initialize DataTables
        $('#konsumenTable').DataTable();
    });
</script>

<script>
    function addHandle() {
        window.location.href = "http://localhost:8080/miniproject/add";
    }
</script>
</body>

</html>
