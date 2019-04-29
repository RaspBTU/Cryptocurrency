package cryptocurrency.amar.cryptocurrency.services;

import cryptocurrency.amar.detailed.Data;
import cryptocurrency.amar.domain.Crypto;


import java.util.Map;

public interface ApiService {

    Map<Integer,Crypto> getCrypto(Integer limit);

    Map<Integer,Crypto> getInDifferentValues(String fiatCurrency);

    Map<Integer,Crypto> getCrypto2(Integer limit);

    Data getInDifferentValues2(Integer idCurrency);


}
