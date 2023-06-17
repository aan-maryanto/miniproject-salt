<!DOCTYPE html>
<html>
<head>
    <title>Form Example</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h2>Form Example</h2>
    <form method="post">
        <div class="form-group">
            <label for="nama">Nama:</label>
            <input type="text" class="form-control" id="nama" name="nama">
        </div>
        <div class="form-group">
            <label for="alamat">Alamat:</label>
            <input type="text" class="form-control" id="alamat" name="alamat">
        </div>
        <div class="form-group">
            <label for="kota">Kota:</label>
            <input type="text" class="form-control" id="kota" name="kota">
        </div>
        <div class="form-group">
            <label for="provinsi">Provinsi:</label>
            <input type="text" class="form-control" id="provinsi" name="provinsi">
        </div>
        <div class="form-group">
            <label for="tgl_registrasi">Tgl Registrasi:</label>
            <input type="date" class="form-control" id="tgl_registrasi" name="tgl_registrasi">
        </div>
        <div class="form-group">
            <label for="status">Status:</label>
            <select class="form-control" id="status" name="status">
                <option value="Aktif">Aktif</option>
                <option value="Non-Aktif">Non-Aktif</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary" onclick="submit()">Submit</button>
    </form>
</div>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
    function submit(){
        console.log("TEST")
        var nama = document.getElementById("nama").value
        var alamat = document.getElementById("alamat").value
        var kota = document.getElementById("kota").value
        var provinsi = document.getElementById("provinsi").value
        var tgl_regitrasi = document.getElementById("tgl_registrasi").value
        var status = document.getElementById("status").value
        console.log(nama)
        $.ajax({
            url: 'http://localhost:8080/miniproject/add',
            type: 'POST',
            data: {
                nama: nama,
                alamat: alamat,
                kota: kota,
                provinsi: provinsi,
                tgl_registrasi: tgl_regitrasi,
                status: status

            },
            success: function(response) {
                // Code to handle the success response
                console.log(response)
            },
            error: function(xhr, status, error) {
                // Code to handle the error response
                console.error(error)
            }
        });
    }
</script>
</body>
</html>
