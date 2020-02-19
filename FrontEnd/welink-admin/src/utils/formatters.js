export default {
    currency: {
        formatter: value => `R$ ${value}`.replace(/\B(?=(\d{3})+(?!\d))/g, ','),
        parser: value => value.replace(/R\$\s?|(,*)/g, ''),
    },
    date: {
        default: 'DD/MM/YYYY',
    }
}
