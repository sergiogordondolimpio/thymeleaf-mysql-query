

$('#birthday').datepicker({
        format: 'yyyy-mm-dd',
        autoclose: true
    });
     $('#inscription').datepicker({
        format: 'yyyy-mm-dd',
        autoclose: true
    });
     $('#birthdayEdit').datepicker({
        format: 'yyyy-mm-dd',
        autoclose: true
    });
     $('#inscriptionEdit').datepicker({
        format: 'yyyy-mm-dd',
        autoclose: true
    });

        $('document').ready(function(){

            $('.table .btn-primary').on('click',function(event){

                event.preventDefault();

                var href= $(this).attr('href');

                $.get(href, function(children, status){
                    $('#idEdit').val(children.id);
                    $('#nameEdit').val(children.name);
                    $('#surnameEdit').val(children.surname);
                    $('#dniEdit').val(children.dni);
                    $('#sexEdit').val(children.sex);
                    $('#birthdayEdit').val(children.birthday);
                    $('#inscriptionEdit').val(children.inscription);
                    $('#regularEdit').val(children.regular);
                    $('#planEdit').val(children.plan);
                    $('#idWhowithdrawEdit').val(children.id_whowithdraw);
                });

                window.$('#editModal').modal('show');
            });

             $('.table .btn-warning').on('click',function(event){
                event.preventDefault();
                var href = $(this).attr('href');
                 $.get(href, function(children, status){
                    $('#idDelete').val(children.id);
                });

                $('#deleteModal').modal();
            });
        });