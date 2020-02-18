import React from 'react';

import Product from 'components/Product';

export default function ProductCatalogue(){
    return (<>
        {[1,1,1,1,1,1,1,1].map(p => <Product/>)}
    </>)
}
