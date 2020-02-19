import React from 'react';

import { Row, Col } from 'antd';
import { Input, Affix } from 'antd';
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
                <Col><MenuToggler/></Col>
                <Col offset={16}><ShoppingCart/></Col>
                <Col><UserMenu/></Col>
            </Row>
            <Row type="flex" justify="space-between" align="middle"
                className="navbar p-2">
                <Col span={24}><SearchBar/></Col>
            </Row>
        </Affix>
    )
}
