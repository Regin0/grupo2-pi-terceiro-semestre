import React from 'react';
import { Layout, Row, Col } from 'antd';
const { Content } = Layout;

export default function CenteredLayout({children, fullHeight}){
    /*
        Layout com todos os componentes centralizados.
        @param fullHeight (bool): layout "estica" pra 100% da altura
        da tela.
    */
    return (
        <Layout>
            <Content>
                <Row
                    className={fullHeight && 'full-vheight'}
                    type='flex'
                    justify='center'
                    align='middle'>
                    {children}
                </Row>
            </Content>
        </Layout>
    );

}

