import React from 'react';
import { Link } from 'react-router-dom';

import { Layout, Row, Col } from 'antd';
import { Tabs } from 'antd';
import { Form, Checkbox, Input, Button, DatePicker } from 'antd';
import { Card, Typography } from 'antd';
const { Paragraph } = Typography;

import { CenteredLayout } from 'layouts/';
import fmts from 'utils/formatters';

function SigninForm(){
    const [tab, setTab] = React.useState("pf");

    React.useEffect(() => {console.log(tab)}, [tab])

    function next(e) { setTab("pj"); }
    function previous(e) { setTab("pf"); }
    return (
        <Form>
            <Tabs activeKey={tab}>
                <Tabs.TabPane tab="Pessoa física" key="pf">
                    <Form.Item label="Nome">
                        <Input />
                    </Form.Item>
                    <Row type="flex" justify="space-between" gutter={24}>
                        <Col span={12}>
                            <Form.Item label="CPF">
                                <Input />
                            </Form.Item>
                        </Col>
                        <Col span={12}>
                            <Form.Item label="Data de nascimento">
                                <DatePicker format={fmts.date.default}/>
                            </Form.Item>
                        </Col>
                    </Row>
                    <Form.Item label="E-mail">
                        <Input />
                    </Form.Item>
                        <Row type="flex" justify="space-between" gutter={24}>
                            <Col span={12}>
                                <Form.Item label="Senha" hasFeedback>
                                    <Input.Password />
                                </Form.Item>
                            </Col>
                            <Col span={12}>
                                <Form.Item label="Confirmar senha" hasFeedback>
                                    <Input.Password />
                                </Form.Item>
                            </Col>
                        </Row>
                    <Form.Item>
                        <Checkbox>
                            Eu concordo em receber mensagens com novidades em meu e-mail.
                        </Checkbox>,
                    </Form.Item>
                    <Button className="full-width" onClick={next}>Pŕoximo</Button>
                </Tabs.TabPane>

                <Tabs.TabPane tab="Pessoa jurídica" key="pj">
                    <Form.Item label="Nome da empresa">
                        <Input />
                    </Form.Item>
                    <Form.Item label="CNPJ">
                        <Input/>
                    </Form.Item>
                    <Button className="full-width" onClick={previous}>Voltar</Button>
                    <Button type='primary' className="full-width">Concluir</Button>
                </Tabs.TabPane>
            </Tabs>
        </Form>
    )
}

export default function SigninPage() {
    return (
        <CenteredLayout fullHeight>
            <Col xs={24} lg={10}>
                <Card>
                        <SigninForm/>
                        <Paragraph className="mv1">Já tem conta? <Link to="/login">Clique aqui para entrar</Link></Paragraph>
                </Card>
            </Col>
        </CenteredLayout>
    );
}
