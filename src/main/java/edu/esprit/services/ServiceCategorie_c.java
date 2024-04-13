package edu.esprit.services;





import edu.esprit.entities.Categorie_c;
import edu.esprit.utils.DataSource;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class ServiceCategorie_c {

        Connection cnx = DataSource.getInstance().getCnx();

        public void ajouter(Categorie_c categorieC) {

            //String req = "INSERT INTO `categorie_c ` (`nom_c`,`description`) VALUES (?,?)";
            String req = "INSERT INTO `categorie_c` (`nom_c`, `description`) VALUES (?, ?)";


            try {
                PreparedStatement ps = cnx.prepareStatement(req);

                ps.setString(1,categorieC.getNom_c());
                ps.setString(2,categorieC.getDescription());
                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        public void modifier(long id, Categorie_c r) {

            try {
                PreparedStatement ste;
                ste = cnx.prepareStatement(
                        "UPDATE `Categorie_c` SET  `nom_c`=?, `description`=? WHERE id=?");
                ste.setString(1, r.getNom_c());
                ste.setString(2, r.getDescription());
                ste.setLong(3, id);

                ste.executeUpdate();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }

        public int supprimer(int id) {
            int i = 0;
            try {
                Statement ste = cnx.createStatement();
                String sql = "DELETE FROM `Categorie_c` WHERE id=" + id;
                i = ste.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceCategorie_c.class.getName()).log(Level.SEVERE, null, ex);
            }
            return i;
        }

        public Set<Categorie_c> getAll() {
            Set<Categorie_c> Categories = new HashSet<>();
            String req = "Select * from Categorie_c" ;
            try {
                Statement st =cnx.createStatement();
                ResultSet rs =st.executeQuery(req);
                while (rs.next()){
                    int id =rs.getInt("id");

                    String nom =rs.getString("nom");

                    String description =rs.getString("description");

                    Categorie_c c = new Categorie_c( nom  , description );
                    Categories.add(c);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return   Categories;
        }

        public Categorie_c getOneById(int id) {

            try {
                String req = "SELECT * FROM Categorie_c WHERE id = " + id;
                PreparedStatement st = cnx.prepareStatement(req);
                ResultSet rs = st.executeQuery(req);
                while (rs.next()) {
//                System.out.println("Offer getted");
                    return new Categorie_c(rs.getInt("id"), rs.getString("nom_c"), rs.getString("description"));

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return null;
        }

    }





