COMPANY:
POST: /user/admin/company/create --cadastrar uma nova company de um usuario
GET: /user/admin/company/{name} --ler os dados de uma empresa

LIST:
/user/admin/list

PRODUCTS:
POST: /products/new-product --registrar uma novo produto
GET: /products/{name} --ler um produto
PUT: /products/change --mudar os dados de um produto
DELETE: /{name} --deletar um produto

USER:
POST: /user/signup --registrar um novo usuario padrao
POST: /user/admin/signup --registrar um novo usuario dono de mercado
GET: /user/signin --login de usuario padrao
GET: /user/admin/signin --login de usuario dono de empresa
