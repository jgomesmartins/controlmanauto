package Entidade;

import Entidade.FIPEVeiculo;
import Entidade.FIPEFabricante;
import Entidade.FIPEAno;
import Entidade.FIPEModelo;
import GUI.JFPrincipal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author GOMES
 */
public class WSFipe {

    private static final int HTTP_COD_SUCESSO = 200;

    public static void setProxyAlpa() {
        JFPrincipal.CarregaConfiguracoes();
    }

    public static List<FIPEFabricante> getFabricante(String tipo) throws MalformedURLException, IOException {

        String URL_WS = "http://fipeapi.appspot.com/api/1/" + tipo + "/marcas.json/";
        URL url = new URL(URL_WS);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        if (con.getResponseCode() != HTTP_COD_SUCESSO) {
            throw new RuntimeException("HTTP error code : " + con.getResponseCode());
        }

        List<FIPEFabricante> listFab = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        JSONArray jarr = new JSONArray(br.readLine());

        for (int i = 0; i < jarr.length(); i++) {
            JSONObject job = new JSONObject(jarr.get(i).toString());

            FIPEFabricante fipef = new FIPEFabricante();
            fipef.setID(job.getInt("id"));
            fipef.setFIPEName(job.getString("fipe_name"));
            fipef.setKey(job.getString("key"));
            fipef.setName(job.getString("name"));
            fipef.setOrder(job.getInt("order"));

            listFab.add(fipef);

            fipef = null;
            job = null;
        }

        return listFab;
    }

    public static List<FIPEModelo> getModelo(String tipo, int codSelect) throws MalformedURLException, IOException {
        
        
        String URL_WS = "http://fipeapi.appspot.com/api/1/" + tipo + "/veiculos/"+codSelect+".json/";
        URL url = new URL(URL_WS);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        if (con.getResponseCode() != HTTP_COD_SUCESSO) {
            throw new RuntimeException("HTTP error code : " + con.getResponseCode());
        }

        List<FIPEModelo> listFab = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        JSONArray jarr = new JSONArray(br.readLine());

        for (int i = 0; i < jarr.length(); i++) {
            JSONObject job = new JSONObject(jarr.get(i).toString());

            FIPEModelo fipem = new FIPEModelo();
       
            fipem.setID(job.getInt("id"));
            fipem.setFIPEName(job.getString("fipe_name"));
            fipem.setKey(job.getString("key"));
            fipem.setName(job.getString("name"));
               
            listFab.add(fipem);

            fipem = null;
            job = null;
        }

        return listFab;
        
        
    }

    public static List<FIPEAno> getAno(String tipo, int codfab, int codmod) throws MalformedURLException, IOException {
        
       //   http://fipeapi.appspot.com/api/1/carros/veiculo/21/4828.json
        String URL_WS = "http://fipeapi.appspot.com/api/1/" + tipo + "/veiculo/"+codfab+"/"+codmod+".json/";
        URL url = new URL(URL_WS);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        if (con.getResponseCode() != HTTP_COD_SUCESSO) {
            throw new RuntimeException("HTTP error code : " + con.getResponseCode());
        }

        List<FIPEAno> listAno = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        JSONArray jarr = new JSONArray(br.readLine());

        for (int i = 0; i < jarr.length(); i++) {
            JSONObject job = new JSONObject(jarr.get(i).toString());

            FIPEAno fipea = new FIPEAno();
       
            fipea.setID(job.getString("id"));
            fipea.setKey(job.getString("key"));
            fipea.setFIPECodigo(job.getString("fipe_codigo"));
            fipea.setName(job.getString("name"));
               
            listAno.add(fipea);

            fipea = null;
            job = null;
        
    }
        return listAno;
    }

    public static List<FIPEVeiculo> getDadosVeiculo(String tipo, int codfab, int codmod, String codAno) throws MalformedURLException, IOException {
        
        //http://fipeapi.appspot.com/api/1/carros/veiculo/21/4828/2013-1.json
        String URL_WS = "http://fipeapi.appspot.com/api/1/" + tipo + "/veiculo/"+codfab+"/"+codmod+"/"+codAno+".json/";
        URL url = new URL(URL_WS);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        if (con.getResponseCode() != HTTP_COD_SUCESSO) {
            throw new RuntimeException("HTTP error code : " + con.getResponseCode());
        }

        List<FIPEVeiculo> listVei = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        JSONObject job = new JSONObject(br.readLine());

        for (int i = 0; i < job.length(); i++) {
   
            FIPEVeiculo fipevei = new FIPEVeiculo();
            
            fipevei.setID(job.getInt("id"));
            fipevei.setAnoModelo(job.getString("ano_modelo"));
            fipevei.setMarca(job.getString("marca").toUpperCase());
            fipevei.setName(job.getString("name").toUpperCase());
            fipevei.setVeiculo(job.getString("name").toUpperCase());
            fipevei.setPreco(job.getString("preco").toUpperCase());
            fipevei.setCombustivel(job.getString("combustivel").toUpperCase());
            fipevei.setReferência(job.getString("referencia").toUpperCase());         
            fipevei.setFipeCodigo(job.getString("fipe_codigo").toUpperCase());
            fipevei.setKey(job.getString("key").toUpperCase());

            listVei.add(fipevei);

            fipevei = null;
      
        
    }
        return listVei;
        
        
        
        
        
    }

 
}
