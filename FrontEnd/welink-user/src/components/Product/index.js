import React from 'react';
import { Skeleton, Switch, Card, Icon, Avatar } from 'antd';
import './style.css';

export default function Product(){
    const actions = [
        <Icon type="info-circle" key="info" />,
        <Icon type="shopping-cart" key="shopping-cart" />,
    ]

    const avatar = (
        <Avatar
            size={100}
            src="https://cdn0.woolworths.media/content/new-homepage/offertile-special-fruit-veg-white-seedless-grapes.jpg"/>
    )
    return (
        <Card actions={actions} className="product-card">
            <Skeleton loading={false} avatar active>
                <Card.Meta avatar={avatar} title="Nome do Produto" description="Descrição do produto"/>
            </Skeleton>
        </Card>
    )
}


