import React from 'react';
import { Layout } from 'antd';

import NavBar from 'components/NavBar';
import Welcome from 'components/Welcome';
import SalesCarousel from 'components/SalesCarousel';
import ProductCatalogue from 'components/ProductCatalogue';
import Footer from 'components/Footer';

function App() {
  return (
      <Layout>
        <NavBar/>
        <SalesCarousel/>
        <Welcome/>
        <ProductCatalogue/>
        <Footer/>
      </Layout>
  );
}

export default App;
