import React from 'react';
import { Link } from 'react-router-dom';
import { Result, Button } from 'antd';

export default function NotFound(){
    return (
        <Result
            status="404"
            title="Página não encontrada! :("
            subTitle="Desculpe, a página que você tentou acessar não existe."
            extra={<Link to="/"><Button type="primary">Voltar para a página inicial</Button></Link>}
        />
    )
}
