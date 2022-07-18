if (document.getElementById("appformu")){
    const app = new Vue({
        el:"#appformu",
        data(){
            return{
            usuarios:[],
            errored:false,
            loading:true,
            }
        },
        created(){
            var url="http://localhost:8080/usuarios"
            this.fetchData(url);
        },
        methods:{
            fetchData(url) {
                fetch(url)
                    .then(response => response.json())
                    .then(data => {
                        this.usuarios = data;
                        this.loading = false;
                    })
                    .catch(err => {
                        this.errored = true
                    })
            },
            eliminar(usuario) {
                const url = 'http://localhost:8080/usuarios/' + usuario;
                var options = {
                    method: 'DELETE',
                }
                fetch(url, options)
                    .then(res => res.text()) // or res.json()
                    .then(res => {
                        location.reload();
                    })
            }
        }
    })
}
