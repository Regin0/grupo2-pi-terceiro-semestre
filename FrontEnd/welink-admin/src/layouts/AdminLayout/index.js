import React from 'react';
import { Layout, Row, Col, PageHeader } from 'antd';
const { Content, Sider, Header } = Layout;

import NavigationMenu from 'components/NavigationMenu';

export default function AdminLayout({children}){
    /*
        Layout padrão para as páginas do admnistrador.
    */
    return (
        <Layout className="full-vheight">
            <Sider><NavigationMenu/></Sider>
            <Content>
                    <PageHeader title="Produtos"
                                subTitle="Controle de estoque"
                                ghost={false}/>
                <Row className="p2" type="flex" justify="center" gutter={[0, 10]}>
                    {React.Children.map(children, child => (
                        <Col span={24}>{child}</Col>
                    ))}
                </Row>
            </Content>
        </Layout>
    )
}
