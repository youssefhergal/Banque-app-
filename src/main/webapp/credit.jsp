
<%@ page language="java" pageEncoding="utf-8" import="com.example.demo1.CreditModel" %>
<%

%>

<!DOCTYPE html>
<html>
<head>
    <title>Crédit Bancaire</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/all.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
</head>
<body>

<br> <br>


<div class="container">
    <div class="col-md-6 col-sm-12  offset-md-3"  >
    <div class="card border border-primary">
        <div class="card-header bg-primary text-light">
            Simulation Crédit
        </div>
        <div class="card-body mb-3">
            <form action="calculer.do" method="post">
                <div class="form-group">
                    <label class=".col-form-label">Montant :</label>
                    <input class="form-control" type="text" name="montant" value="${creditModel.getMontant()}"/>
                </div>

                <div class="form-group">
                    <label class=".col-form-label">Duree :</label>
                    <input class="form-control" type="text" name="duree" value="${creditModel.getDuree()}"/>
                </div>

                <div class="form-group">
                    <label class=".col-form-label">Taux :</label>
                    <input class="form-control" type="text" name="taux" value="${creditModel.getTaux()}"/>
                </div>
                <button class="btn btn-success mt-2" type="submit"> calculer </button>

            </form>
        </div>
        <div class="card-footer ">
            Mensualiteé = ${creditModel.getMensualite()}
        </div>
    </div>

</div>
</div>



</body>
</html>