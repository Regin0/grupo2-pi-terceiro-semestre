import React from 'react';
import { Layout, Row, Col } from 'antd';
const { Content } = Layout;

export default function CenteredLayout({children, fullHeight}){
    const style = {
        height: fullHeight ? '100vh' : 'auto',
    }
    return (
        <Layout>
            <Content>
                <Row style={style} type='flex' justify='center' align='middle'>
                    {children}
                </Row>
            </Content>
        </Layout>
    );

}

