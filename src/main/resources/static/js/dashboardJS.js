async function cargarDatos(){
    try {
        const respuesta = await fetch('http://localhost:8080/api/dashboard');
        const consultas = await respuesta.json();
        let plantilla = document.querySelector('#contenedorContratos')
        console.log("hola?");
        consultas.forEach(consulta => {
            plantilla.innerHTML += 
            `
                <div class="tarjeta-contrato">
                    <h4 class="contrato-titulo">${consulta.descripcion_del_proceso || 'Sin nombre'}</h4>
                    <p class="contrato-ciudad">📍 ${consulta.ciudad}</p>
                    <div class="contrato-footer">
                        <span class="contrato-estado">${consulta.estado_contrato || 'Indefinido'}</span>
                        <span class="contrato-valor">$${Number(consulta.valor_del_contrato || 0).toLocaleString('es-CO')}</span>
                    </div>
                </div>
            `;
        });

    } catch (error) {
        console.log("Error con la Api : " , error);
    }
}
cargarDatos();