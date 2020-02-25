import React from 'react';

import { Row, Col } from 'antd';
import { Input, Affix, Typography } from 'antd';
import { Button, Icon } from 'antd';

import ShoppingCart from 'components/ShoppingCart';
import MenuToggler from 'components/MenuToggler';
import UserMenu from 'components/UserMenu';

import './style.css';

function SearchBar(){
    return (
        <Input.Search placeholder="Procure aqui" className="w-100"/>
    )
}

export default function NavBar(){
    return (
        <Affix>
            <Row type="flex" justify="space-between" align="middle"
                className="navbar p-2">
                <Col>
                    <MenuToggler/>
                    <Typography.Text className="logo">Mercadinho</Typography.Text>
                </Col>
                <Col>
                    <Row type="flex" gutter={[6]}>
                        <Col><ShoppingCart/></Col>
                        <Col><UserMenu/></Col>
                    </Row>
                </Col>
            </Row>
            <Row type="flex" justify="space-between" align="middle"
                className="navbar p-2">
                <Col span={24}><SearchBar/></Col>
            </Row>
        </Affix>
    )
}
