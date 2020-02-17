import React from 'react';
import { Menu, Icon, Avatar } from 'antd';
const { SubMenu } = Menu;

import './style.css'

function MenuHeader(){
    return (
        <div className="avatar-container">
            <Avatar size="large" icon="user" className="avatar"/>
        </div>
    )
}

function DashboardMenuItem(props){
    return (
        <Menu.Item key="1" {...props}>Visão Geral</Menu.Item>
    )
}

function ManagementMenuItem(props){

    const submenuTitle = (
        <span>
            <Icon type="carry-out"/>
            <span>Gerenciar</span>
        </span>
    );
    return (
        <SubMenu key="management" title={submenuTitle}  {...props}>
            <Menu.Item key="manag-1">Produtos</Menu.Item>
            <Menu.Item key="manag-2">Vendas</Menu.Item>
        </SubMenu>
    )
}

function ConfigMenuItem(props){
    const submenuTitle = (
        <span>
            <Icon type="setting"/>
            <span>Configurar</span>
        </span>
    );
    return (
        <SubMenu key="config" title={submenuTitle} {...props} >
            <Menu.Item key="config-1">Perfil</Menu.Item>
        </SubMenu>
    )
}

export default function NavigationMenu(){

    const defaultOpenKeys = ['sub1'];
    return (
        <Menu
            theme="dark"
            defaultOpenKeys={defaultOpenKeys}
            mode="inline"
            className="full-width full-height menu"
        >
            <MenuHeader/>
            <DashboardMenuItem/>
            <ManagementMenuItem/>
            <ConfigMenuItem/>
        </Menu>
    )
}
