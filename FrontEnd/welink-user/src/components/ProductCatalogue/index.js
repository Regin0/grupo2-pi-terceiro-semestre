import React from 'react';
import { Row, Col, Typography, Pagination } from 'antd';

import Product from 'components/Product';

const { Title } = Typography;

function ColItem(){
    return (
        <Col md={12} lg={6}>
            <Product/>
        </Col>
    )
}

export default function ProductCatalogue(){
    return (<main className="p-4">
        <Title>Produtos em destaque</Title>
        <Row gutter={[8, 8]} className="mt-2 mb-2">
            {[1,1,1,1,1,1,1,1].map(p => <ColItem/>)}
        </Row>
        <Pagination/>
    </main>)
}
