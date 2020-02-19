import React from 'react';
import { Card, Icon, Avatar, Row, Col } from 'antd';
const { Meta } = Card;

export default function Metrics(){
    /* Grupo com 4 métricas */
    return (
        <Row type="flex" justify="space-between" gutter={[10,0]}>
            {[0,0,0,0].map(c => (
                <Col span={6}>
                    <Card>
                        <Meta
                            title="126"
                            description="Produtos no estoque"
                            avatar={
                                <Avatar icon="user" />
                            }/>
                    </Card>
                </Col>
            ))}
        </Row>
    )
}
