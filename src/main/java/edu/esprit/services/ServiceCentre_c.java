package edu.esprit.services;


import edu.esprit.entities.Centre_c;
import edu.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

    public class ServiceCentre_c implements IService<Centre_c> {
        Connection cnx = DataSource.getInstance().getCnx();

        public ServiceCentre_c() {
        }

        public void ajouter(Centre_c centreC) {
            String req = "INSERT INTO `centre_c` (`adresse`, `nom`, `contact`, `gallery`, `description`, `image`) VALUES (?,?,?,?,?,?)";

            try {
                PreparedStatement ps = this.cnx.prepareStatement(req);
                ps.setString(1, centreC.getAdresse());
                ps.setString(2, centreC.getNom());
                ps.setString(3, centreC.getContact());
                ps.setString(4, centreC.getGallery());
                ps.setString(5, centreC.getDescription());
                ps.setString(6, centreC.getImage());
                ps.executeUpdate();
            } catch (SQLException var4) {
                System.out.println(var4.getMessage());
            }

        }

        public void modifier(Centre_c centreC) throws SQLException {
        }

        public void modifier(long id, Centre_c r) {
            try {
                PreparedStatement ste = this.cnx.prepareStatement("UPDATE `Centre_c` SET `adresse`=?, `nom`=?, `contact`=?, `gallery`=?, `description`=?, `image`=? WHERE id=?");
                ste.setString(1, r.getAdresse());
                ste.setString(2, r.getNom());
                ste.setString(3, r.getContact());
                ste.setString(4, r.getGallery());
                ste.setString(5, r.getDescription());
                ste.setString(6, r.getImage());
                ste.setLong(7, id);
                ste.executeUpdate();
            } catch (SQLException var5) {
                System.err.println(var5.getMessage());
            }

        }

        public void supprimer(int id) {
            int i = 0;

            try {
                Statement ste = this.cnx.createStatement();
                String sql = "DELETE FROM `Centre_c` WHERE id=" + id;
                i = ste.executeUpdate(sql);
            } catch (SQLException var5) {
            }

           // return i;
        }

        public Set<Centre_c> getAll() {
            Set<Centre_c> Centres = new HashSet();
            String req = "Select * from Centre_c";

            try {
                Statement st = this.cnx.createStatement();
                ResultSet rs = st.executeQuery(req);

                while(rs.next()) {
                    int id = rs.getInt("id");
                    String adresse = rs.getString("adresse");
                    String nom = rs.getString("nom");
                    String contact = rs.getString("contact");
                    String gallery = rs.getString("gallery");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    Centre_c c = new Centre_c(id, adresse, nom, contact, gallery, description, image);
                    Centres.add(c);
                }
            } catch (SQLException var13) {
                System.out.println(var13.getMessage());
            }

            return Centres;
        }

        public Centre_c getOneById(int id) {
            try {
                String req = "SELECT * FROM Centre_c WHERE id = " + id;
                PreparedStatement st = this.cnx.prepareStatement(req);
                ResultSet rs = st.executeQuery(req);
                if (rs.next()) {
                    return new Centre_c(Integer.toString(rs.getInt("id")), rs.getString("adresse"), rs.getString("nom"), rs.getString("contact"), rs.getString("gallery"), rs.getString("description"));
                }
            } catch (SQLException var5) {
                System.out.println(var5.getMessage());
            }

            return null;
        }
    }


