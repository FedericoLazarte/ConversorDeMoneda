# Conversor de Monedas

¡Proyecto **Conversor de Monedas**! Este proyecto permite convertir valores entre diferentes monedas utilizando la API de ExchangeRate. Este proyecto es para fines didacticos.

## 🛠️ Tecnologías Utilizadas

- **Java**
- **Gson** - Biblioteca para deserializar JSON.
- **Java HttpClient** - Para realizar solicitudes HTTP.
- **ExchangeRate API** - Proveedor de tasas de cambio. https://www.exchangerate-api.com/

## 🧩 Uso

1. **Ejecuta la Aplicación**

   Al ejecutar la aplicación, verás un menú con las opciones disponibles para seleccionar la moneda base.

2. **Selecciona la Moneda Base**

   Elige una opción del menú (1-3) para seleccionar la moneda base.

3. **Ingresa la Moneda a Convertir**

   Introduce la moneda a la que deseas convertir (ej. USD, ARS, EUR).

4. **Ingresa el Monto**

   Proporciona el monto que deseas convertir.

5. **Obtén el Resultado**

   La aplicación mostrará el valor convertido y la información relacionada.

## 📋 Ejemplo

```
Ingrese el valor el tipo de moneda base:
1. ARS
2. USD
3. EUR
4. Salir
Selecciona una opción (1-4): 1
Ingrese la moneda a convertir (ej. USD, ARS, EUR): USD
Ingrese el monto a convertir: 25000
Moneda{monedaPrincipal='ARS', monedaACambiar='USD', valor=25000.0, conversion=0.005, El total es= 125.0}
```

## 🔧 Configuración Adicional

- **Modifica las Monedas Disponibles**: Edita el arreglo `tipoMonedas` en `App.java` para agregar o eliminar monedas.
- **Manejo de Errores**: Asegúrate de que el manejo de errores esté correctamente implementado para obtener mensajes claros en caso de fallos en la API.

## 📜 Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## 📞 Contacto

Para más información, puedes contactar con el autor en [fedelazarte2015@gmail.com](mailto:tu_email@ejemplo.com).

---

¡Gracias por utilizar el Conversor de Monedas! 🌟
