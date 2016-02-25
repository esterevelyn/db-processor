import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataObject {

    /**
     * Encapsula o mapa multivalorado (mapa de listas).
     * 
     * Um exemplo de mapa contido na vari�vel 'data':
     * 
     * {AttrA=[valor1,valor2,valor3], AttrB=[valorX], AttrC=[ValueA, ValueB]}
     */

    Map<String, List<String>> data = new HashMap<>();

    public void insertData(String key, String value) {
        // Se for uma chave ainda inexistente
        if (data.get(key) == null) {
            List<String> newList = new ArrayList<>();
            newList.add(value);
            data.put(key, newList);
        } else { // Se j� existir chave, adiciona na lista j� existente
            data.get(key).add(value);
        }
    }

    public Map<String, List<String>> getData() {
        return data;
    }

    public void setData(Map<String, List<String>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
