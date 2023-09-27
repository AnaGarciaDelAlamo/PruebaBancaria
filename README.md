# PruebaBancaria

Mi repositorio: https://github.com/AnaGarciaDelAlamo/PruebaBancaria.git

Imagina que eres parte del equipo de desarrollo de un emergente negocio FinTech. Tu compañía está construyendo un nuevo sistema bancario y necesitas garantizar que el sistema puede manejar simultáneamente múltiples transacciones bancarias de alta frecuencia sin comprometer la integridad de los datos.

Para probar esto, estás encargado de construir una simulación en Java que genere procesos concurrentes que efectúen depósitos y retiros en una cuenta bancaria, y verificar que el saldo final es el esperado después de todas las transacciones.

Comienza con una cuenta que tiene un saldo de 10,000 euros. La simulación debe incluir procesos que efectúen las siguientes operaciones:

Depósito de 100 euros (x400)
Depósito de 50 euros (x200)
Depósito de 20 euros (x600)
Retiro de 100 euros (x400)
Retiro de 50 euros (x200)
Retiro de 20 euros (x600)
Estos procesos deben ser lanzados en paralelo y tu programa debe garantizar que al final de todas las operaciones, el saldo de la cuenta debe ser exactamente igual a 10,000 euros, el saldo original.

Tu solución debe hacer uso de la concurrencia y el paralelismo para manejar las transacciones. Además, debe ser lo suficientemente robusta como para manejar cualquier problema de concurrencia, como condiciones de carrera.

El programa debe contener al menos las siguientes clases:

Cuenta: Clase que mantiene el estado de la cuenta y proporciona métodos sincronizados para depositar y retirar fondos.
HiloCliente: Clase que implementa la interfaz Runnable y representa un proceso individual que realiza transacciones en la cuenta.
Lanzador: Clase que lanza todos los hilos de los clientes y verifica que la simulación ha funcionado correctamente al final.
Asegúrate de probar a fondo tu programa con diferentes conjuntos de datos de prueba para verificar su robustez y corrección.

Tu código fuente debe estar bien estructurado, limpio y bien comentado. Asegúrate de seguir las mejores prácticas de la programación orientada a objetos y la programación concurrente en Java.
