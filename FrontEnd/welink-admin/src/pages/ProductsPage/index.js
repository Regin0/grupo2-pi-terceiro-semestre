import React from 'react';
import { AdminLayout } from 'layouts/';

import ProductsTable from './ProductsTable';
import Metrics from './Metrics';
import AddModal from './AddModal';

export default function ProductsPage(){
    /* Pagina de produtos */

    return (
        <AdminLayout>
            <Metrics/>
            <AddModal/>
            <ProductsTable/>
        </AdminLayout>
    );
}
