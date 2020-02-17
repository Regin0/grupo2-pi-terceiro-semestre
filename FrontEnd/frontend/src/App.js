import React from 'react';
import { Switch, Route, BrowserRouter } from 'react-router-dom';
import LoginPage from 'pages/LoginPage/index.js';
import SigninPage from 'pages/SigninPage/index.js';
import ProductsPage from 'pages/ProductsPage/index.js';
import NotFound from 'pages/NotFound/index.js';

function App(){
    return (
        <div>
            <BrowserRouter>
                <Switch>
                    <Route exact path={["/", "/login"]} component={LoginPage}/>
                    <Route exact path={["/signin"]} component={SigninPage}/>
                    <Route path={["/admin"]} component={ProductsPage}/>
                    <Route component={NotFound}/>
                </Switch>
            </BrowserRouter>
        </div>
    );
}

export default App;
