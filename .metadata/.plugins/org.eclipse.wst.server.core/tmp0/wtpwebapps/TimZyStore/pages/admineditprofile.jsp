<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Edit Admin Profile</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/Stylesheet/admin.css">
</head>
<body>
<div class="container">
  <div class="profile">
    <div class="profile-details">
      <h2>Edit Admin Profile</h2>
      <form>
        <div class="form-group">
          <label for="name">Name:</label>
          <input type="text" id="name" name="name" placeholder="Admin Name">
        </div>
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" placeholder="Admin Email">
        </div>
        <div class="form-group">
          <label for="gender">Gender:</label>
          <select id="gender" name="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
          </select>
        </div>
        <div class="form-group">
          <label for="phone">Phone Number:</label>
          <input type="tel" id="phone" name="phone" placeholder="Admin Phone Number">
        </div>
        <div class="form-group">
          <label for="profile-pic">Profile Picture:</label>
          <input type="file" id="profile-pic" name="profile-pic">
        </div>
        <button type="submit">Save Changes</button>
        <button type="button" onclick="goBack()">Go Back</button> <!-- Button to go back to admin profile -->
      </form>
    </div>
    <div class="profile-pic">
      <img src="admin_profile_pic.jpg" alt="Admin Profile Picture">
    </div>
    <button class="change-profile-btn" style="margin-top: 10px;">Change Profile Picture</button>
  </div>
</div>

<script>
// Function to go back to the admin profile page
function goBack() {
  window.location.href = "adminprofile.jsp"; // Redirect to adminprofile.jsp page
}
</script>

</body>
</html>
